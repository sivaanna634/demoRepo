#!/bin/bash
TARGET_URL=${1}
CF_USER=${2}
CF_PWD=${3}
CF_ORG=${4}
CF_SPACE=${5}
MANIFEST_FILE=${6}
APP_FILE=${7}

echo "Before Deployment Start"
cf login ${TARGET_URL} -u ${CF_USER} -p ${CF_PWD} -o ${CF_ORG} -s ${CF_SPACE}
echo "Logged into Cloud Foundry"
cf push -f ${MANIFEST_FILE} -p ${APP_FILE}
echo "Deployed into Cloud Foundry"

