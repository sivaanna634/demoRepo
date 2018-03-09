
#TARGET_URL=https://api.run.pivotal.io
#CF_USER=a.s.j.nivetha14@gmail.com
#CF_PWD=SwamiJo@05
#CF_ORG=SampleSpace
#CF_SPACE=development
#MANIFEST_FILE=src/main/resources/manifest.yml
#APP_FILE=target/Restful_Return_Xml_Json.war

echo "Before Deployment Start"
cf login ${TARGET_URL} -u ${CF_USER} -p ${CF_PWD} -o ${CF_ORG} -s ${CF_SPACE}
echo "Logged into Cloud Foundry"
cf push -f ${MANIFEST_FILE} -p ${APP_FILE}
echo "Deployed into Cloud Foundry"

