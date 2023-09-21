source="http:helloweb" (index="history" OR index="index_84209" OR index="main" OR index="summary")



docker run -d -p 8000:8000 -e "SPLUNK_START_ARGS=--accept-license" -e "SPLUNK_PASSWORD=test123@A" --name splunk splunk/splunk:latest
docker run -d -p 8000:8000 -p 8088:8088 -e "SPLUNK_START_ARGS=--accept-license" -e "SPLUNK_PASSWORD=your_password" --name splunk splunk/splunk