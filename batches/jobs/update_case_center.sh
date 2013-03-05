#~/bin/bash
cd `dirname $0`/../case_center
source "$HOME/.rvm/scripts/rvm"
rvm use jruby-1.7.2@case_center --create
gem install bundler 
bundle install

