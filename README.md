# SpriteCloud

# Reqirements
 1. Java v.15
 2. maven
 3. Jenkins
 
 Repo Link: https://github.com/HudaKhaled/SpriteCloud
 
# How to run tests manually


  1. Get clone from the repo using git clone command:
   git clone https://github.com/HudaKhaled/SpriteCloud.git
  
  2. Go to the repo on your local machine and check out master using this command:
   git checkout master
  
   3. Open the project in your IDE like intellij or eclipse
   
   4. Run maven commands clean install to download all dependencies in pom.xml

  5. To run all tests, Go to testng.xml file, right click >> run testng.xml
  
   6. To run a single test, go to test>java>tests> then right click on any test and run.
   
   7. To see test results in reports:
    - Open test-output folder, you will find SpriteCloudExtent.html report and testng-results.xml report
    
    
    
# How to run tests from CI - Jenkins

1. In the directory where "jenkins.war" is downloaded, run this command "java -jar jenkins.war" to run jenkins
2. Open http://0c11-45-247-92-207.ngrok.io/job/SpriteCloudSeleniumTask/ to check the configured job
3. Run these 3 commands
  1. git checkout -b  Noref-trigger-tests-version-50
  2. git commit --allow-empty -m "trigger tests"
  3. git push -u origin  Noref-trigger-tests-version-50

4. Then go to the repo on git, make pull request, and merge
5. Check the triggered build on http://0c11-45-247-92-207.ngrok.io/job/SpriteCloudSeleniumTask/
6. After runnung the job, you will find test results in Extent report and testng report
