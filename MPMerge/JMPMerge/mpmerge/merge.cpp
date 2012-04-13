
/* Copyright(C) 2010, MergePower Inc */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_MCFG_SIZE 50000
#define MAX_PARAM_CHARS 200
#define FNAME_SIZE      256
#define TRUE       1
#define FALSE      0

#ifdef __cplusplus
  extern "C" {
#endif

char *loadFile(char *);
char *merge(char *, char *, char *, char *, char *, char *, char *, char *, char *, char *, char *);

#ifdef __cplusplus
  }
#endif


/*
char* loadFile(char* szFilename)
{
   FILE* file = fopen(szFilename, "rb");
   if(file)
   {
      fseek(file, 0, SEEK_END);
      int iFileSize = ftell(file);
      rewind(file);

      char* szBuffer = new char[iFileSize+1];
      memset(szBuffer, 0, iFileSize + 1);

      fread(szBuffer, iFileSize, 1, file);

      fclose(file);

      return szBuffer;
   }
   else
   {
      printf("Error opening file %s\n", szFilename);
      return NULL;
   }

}*/

bool is_blank(const char* szWord)
{
   return (strlen(szWord) == 0);
}

int main(int argc, char **argv)
{
   char xpn_fname[FNAME_SIZE+1], tu_fname[FNAME_SIZE+1];
   char efx_fname[FNAME_SIZE+1], misc_params[MAX_PARAM_CHARS+1];
   char xml_fname[FNAME_SIZE+1], fname[FNAME_SIZE+1];
   char license_data[FNAME_SIZE+1];
   char *efx_infile, *efx_infile2, *tu_infile, *tu_infile2;
   char *xpn_infile, *xpn_infile2, *xmlin1, *xmlin2;
   char *mcfg, *output;
   int numargs=1, quit=FALSE;

   memset(xml_fname, 0, sizeof(xml_fname));
   memset(xpn_fname, 0, sizeof(xpn_fname));
   memset(tu_fname, 0, sizeof(tu_fname));
   memset(efx_fname, 0, sizeof(efx_fname));
   memset(misc_params, 0, sizeof(misc_params));
   memset(license_data, 0, sizeof(license_data));

   xpn_infile = xpn_infile2 = 0;
   tu_infile  = tu_infile2  = 0;
   efx_infile = efx_infile2 = 0;
   xmlin1 = xmlin2 = mcfg = 0;

   /* Go thru all the args */
   while (numargs <= (argc - 1)) {

      /* -m indicates a merge config file  */
      if (!strcmp(argv[numargs],"-m")) {
         ++numargs;
         if (numargs <= (argc - 1)) {
            sprintf(fname, "%.*s", FNAME_SIZE, argv[numargs]);
            mcfg = loadFile(fname);
         }
         else {
            printf("The \"-m\" option requires a merge config filename");
            quit = TRUE;
            break;
         }
      }
      /* -l is followed by a license data string */
      else if (!strcmp(argv[numargs],"-l")) {
         ++numargs;
         if (numargs <= (argc - 1)) {
            sprintf(license_data, "%.*s", FNAME_SIZE, argv[numargs]);
         }
         else {
            printf("The \"-l\" option must be followed by license data");
            quit = TRUE;
            break;
         }
      }
      else if (!strcmp(argv[numargs],"-x")) {
         ++numargs;
         if (numargs <= (argc - 1)) {
            if (is_blank(xpn_fname)) {
               sprintf(xpn_fname, "%.*s", FNAME_SIZE, argv[numargs]);
               xpn_infile = loadFile(xpn_fname);
            }
            else {
               sprintf(fname, "%.*s", FNAME_SIZE, argv[numargs]);
               xpn_infile2 = loadFile(fname);
            }
         }
         else {
            printf("The \"-x\" option requires a filename that contains an Experian infile");
            quit = TRUE;
            break;
         }
      }
      else if (!strcmp(argv[numargs], "-t")) {
         ++numargs;
         if (numargs <= (argc - 1)) {
            if (is_blank(tu_fname)) {
               sprintf(tu_fname, "%.*s", FNAME_SIZE, argv[numargs]);
               tu_infile = loadFile(tu_fname);
            }
            else {
               sprintf(fname, "%.*s", FNAME_SIZE, argv[numargs]);
               tu_infile2 = loadFile(fname);
            }
         }
         else {
            printf("The \"-t\" option requires a filename that contains a TU infile");
            quit = TRUE;
            break;
         }
      }
      else if (!strcmp(argv[numargs], "-e")) {
         ++numargs;
         if (numargs <= (argc - 1)) {
            if (is_blank(efx_fname)) {
               sprintf(efx_fname, "%.*s", FNAME_SIZE, argv[numargs]);
               efx_infile = loadFile(efx_fname);
            }
            else {
               sprintf(fname, "%.*s", FNAME_SIZE, argv[numargs]);
               efx_infile2 = loadFile(fname);
            }
         }
         else {
            printf("The \"-t\" option requires a filename that contains an Equifax infile");
            quit = TRUE;
            break;
         }
      }
      else if (!strcmp(argv[numargs],"-ix")) {
         ++numargs;
         if (numargs <= (argc - 1)) {
            if (is_blank(xml_fname)) {
               sprintf(xml_fname, "%.*s", FNAME_SIZE, argv[numargs]);
               xmlin1 = loadFile(xml_fname);
            }
	    else {
               sprintf(fname, "%.*s", FNAME_SIZE, argv[numargs]);
               xmlin2 = loadFile(fname);
            }
         }
         else {
            printf("The \"-ix\" option requires an xml report filename");
            quit = TRUE;
            break;
         }
      }
      else if (!strcmp(argv[numargs],"-mp")) {
         ++numargs;
         if (numargs <= (argc - 1)) {
            sprintf(misc_params, "%.*s", MAX_PARAM_CHARS, argv[numargs]);
         }
      }
      else {
         printf("ERROR parsing args: <%.49s>", argv[numargs]);
         quit = TRUE;
         break;
      }

      ++numargs;
   }

   // Make sure all required parameters were sent.
   if (mcfg == 0 || license_data[0] == 0) {
      printf("ERROR: both -m and -l options are required\n");
      quit = TRUE;
   }

   if (xpn_infile == 0 && tu_infile == 0 && efx_infile == 0 && xmlin1 == 0) {
      printf("ERROR: at least one of -x, -e, -t -ix is required\n");
      quit = TRUE;
   }

   if (quit == TRUE || argc < 2) {
      printf("\nUsage: %s -m <merge config file> -x <xpn file #1> -x <xpn file #2>\n", argv[0]);
      printf("      -t <tu file #1> -t <tu file #2> -e <equifax file #1>\n");
      printf("      -e <equifax file #2> -mp <misc params>\n");
      exit(1);
   }

   output = merge(license_data, mcfg, xpn_infile, tu_infile, efx_infile, misc_params, xmlin1, xpn_infile2, tu_infile2, efx_infile2, xmlin2);

   // printf("%s\n", output);

   return(TRUE);
}


