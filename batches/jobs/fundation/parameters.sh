#~/bin/bash

date

CUR_DIR=`dirname $(readlink -f $0)`
INPUT_DIR=/var/lib/batches/results/fundation/parameters
mkdir -p $INPUT_DIR
cd $INPUT_DIR

for PFILE in Demographic.csv IndustryCDS.csv IndustryFlag.csv IndustrySIC.csv Usury.csv; do
  rm $INPUT_DIR/$PFILE
  s3cmd get s3://dataview-systems-uat/fundation/batch/parameters/$PFILE 
  if [ $? -eq 0 ]; then
    mysql -hdataview-uat.cinlbvdelgsh.us-east-1.rds.amazonaws.com -Dfundation_uat -ufundation_uat -pfundation01 < $CUR_DIR/sql_import_$PFILE.sql
    if [ $? -eq 0 ]; then
      s3cmd del s3://dataview-systems-uat/fundation/batch/parameters/$PFILE
      echo Success
    else
      echo Failed to run DB script, error level: $0
    fi
  else
    echo "Failed to get file from s3 $0"
  fi
done

