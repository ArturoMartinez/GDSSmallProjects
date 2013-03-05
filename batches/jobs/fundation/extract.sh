#~/bin/bash
cd `dirname $0`/../../case_center
source "$HOME/.rvm/scripts/rvm"
rvm use jruby-1.7.2@case_center

export OUTPUT_DIR=/var/lib/batches/results/fundation/extract
export OUTPUT_FILENAME=$OUTPUT_DIR/fundation_extract_%Y-%m-%d.csv
mkdir -p $OUTPUT_DIR
rake client:job[fundation/extract]

s3cmd put $OUTPUT_DIR/* s3://dataview-systems-uat/fundation/batch/extract/
rm $OUTPUT_DIR/*
