#!/bin/bash

out=/tmp/fullIndex.json


touch $out
cp="/home/philld/.m2/repository/javax/servlet/javax.servlet-api/3.1.0/javax.servlet-api-3.1.0.jar:/home/philld/dhis2/dhis2-core/dhis-2/dhis-web/dhis-web-portal/target/dhis/WEB-INF/lib/*"
dp="./target/restApiDoclet-1.0.0.jar:./target/lib/velocity-1.7.jar:./target/lib/commons-lang-2.6.jar:./target/lib/jackson-annotations-2.3.0.jar:./target/lib/jackson-core-2.3.0.jar:./target/lib/jackson-databind-2.3.0.jar:./target/lib/commons-collections-3.2.1.jar"
tp=src/main/resources/rest_api_template_json.vm

javadoc -classpath $cp -docletpath $dp -doclet biz.rightshift.commons.doclet.SpringWebServicesRestApiDoclet $1 -template $tp

cat index.html >> $out

