// Type: s3copy.Program
// Assembly: s3copy-one, Version=0.2.3417.3421, Culture=neutral, PublicKeyToken=null
// Assembly location: C:\Users\simon.smith\Downloads\s3copy.exe

using Affirma.ThreeSharp;
using Affirma.ThreeSharp.Model;
using Affirma.ThreeSharp.Query;
using System;
using System.Text;
using System.IO;

namespace s3copy
{
    internal class Program
    {
        private static int Main(string[] args)
        {
            Console.WriteLine("s3copy v0.2 by Max Flodén 2009 - blog.tjitjing.com");
            Console.WriteLine("Modified by Simon");
            Console.WriteLine("Using ThreeSharp Amazon S3 C# Library");
            Console.WriteLine("Syntax: s3copy Localpath Bucket Filename AccessKeyId SecretAccessKey" + Environment.NewLine);
            if (args.Length != 5)
            {
                Console.WriteLine("Error: Invalid number of arguments");
                return 1;
            }
            else
            {
                string str1 = args[0];
                string bucketName = args[1];
                string str2 = args[2];
                string str3 = args[3];
                string str4 = args[4];
                try
                {
                    IThreeSharp threeSharp = (IThreeSharp)new ThreeSharpQuery(new ThreeSharpConfig()
                    {
                        AwsAccessKeyID = str3,
                        AwsSecretAccessKey = str4
                    });
                    Console.Write("Copying file to s3... ");
                    DateTime now = DateTime.Now;
                    using (ObjectAddRequest request = new ObjectAddRequest(bucketName, str2.Replace(" ", "_")))
                    {                        
                        request.LoadStreamWithFile(Path.Combine(str1,str2));
                        request.Headers.Add("x-amz-acl", "public-read");
                        using (ObjectAddResponse response = threeSharp.ObjectAdd(request))
                        {
                            
                        }
                    }


                    TimeSpan timeSpan = DateTime.Now - now;
                    Console.WriteLine("Done!" + Environment.NewLine);
                    Console.WriteLine("Time: " + (object)timeSpan + " (hh:mm:ss)");
                    Console.WriteLine("Total data transfers: " + threeSharp.GetTransferInfos().Length.ToString());
                    Console.WriteLine("Total bytes uploaded: " + threeSharp.GetTotalBytesUploaded().ToString());
                    Console.WriteLine("Total bytes downloaded: " + threeSharp.GetTotalBytesDownloaded().ToString());
                    return 0;
                }
                catch (ThreeSharpException ex)
                {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.AppendLine("An exception occurred.");
                    stringBuilder.AppendLine("Message: " + ex.Message);
                    stringBuilder.AppendLine("HTTP Status Code: " + ((object)ex.StatusCode).ToString());
                    stringBuilder.AppendLine("Error Code: " + ex.ErrorCode);
                    stringBuilder.AppendLine("XML: " + ex.XML);
                    Console.WriteLine(((object)stringBuilder).ToString());
                    return 2;
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                    return 2;
                }
            }
        }
    }
}

