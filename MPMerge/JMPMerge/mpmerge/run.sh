
if [ $# -ne 1 ]
then
   echo "USAGE: $0  <infile>"
   exit
fi

./release/merge.exe -l EBDEESEH -m cfg/merge.mcfg -x input/$1.XPN -e input/$1.EFX -t input/$1.TU -mp "Logging=\"ALL:/home/ecr/merge/log\" XMLOutput=\"/home/ecr/merge/output/$1.xml\" ShowCodes=\"YES\" RatingCodeType=\"Experian\""


