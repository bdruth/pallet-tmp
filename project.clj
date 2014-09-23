(defproject pallet-tmp "0.1.0-SNAPSHOT"
  :description "Pallet project for tbatchelli"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.cloudhoist/pallet "0.7.5"
                   :exclusions
                   [jsch-agent-proxy/jsch-agent-proxy-jna
                    jsch-agent-proxy]]
                 [com.palletops/pallet-jclouds "1.7.3"]
                 ;; To get started we include all jclouds compute providers.
                 ;; You may wish to replace this with the specific jclouds
                 ;; providers you use, to reduce dependency sizes.
                 [org.apache.jclouds/jclouds-compute "1.7.1"]
                 [org.apache.jclouds/jclouds-blobstore "1.7.1"]
                 [org.apache.jclouds.labs/aws-elb "1.7.1"]
                 [org.apache.jclouds.api/s3 "1.7.1"]
                 [org.apache.jclouds.api/ec2 "1.7.1"]
                 [org.apache.jclouds.provider/aws-s3 "1.7.1"]
                 [org.apache.jclouds.provider/aws-ec2 "1.7.1"]
                 ;[org.apache.jclouds.labs/vcloud-director "1.7.1"]
                 [org.apache.jclouds.driver/jclouds-sshj "1.7.1"]
                 [org.apache.jclouds.driver/jclouds-slf4j "1.7.1"]
                 [com.jcraft/jsch "0.1.51"]
                 [com.jcraft/jsch.agentproxy.usocket-jna "0.0.7"]
                 [com.jcraft/jsch.agentproxy.usocket-nc "0.0.7"]
                 [com.jcraft/jsch.agentproxy.sshagent "0.0.7"]
                 [com.jcraft/jsch.agentproxy.pageant "0.0.7"]
                 [com.jcraft/jsch.agentproxy.core "0.0.7"]
                 [com.jcraft/jsch.agentproxy.jsch "0.0.7"]

                 [org.slf4j/slf4j-api "1.6.1"]
                 [ch.qos.logback/logback-core "1.0.0"]
                 [ch.qos.logback/logback-classic "1.0.0"]
                 [org.cloudhoist/git "0.7.0-SNAPSHOT"]
                 [org.cloudhoist/java "0.6.0-SNAPSHOT"]
                 [org.cloudhoist/splunk "0.7.0-SNAPSHOT"]
                 [org.cloudhoist/tomcat "0.7.0-beta.1"]
                 [org.cloudhoist/mysql "0.5.0"]
                 [org.cloudhoist/crontab "0.5.0"]
                 [org.cloudhoist/gpg "0.5.0"]
                 [org.cloudhoist/maven "0.5.0"]
                 [org.cloudhoist/hudson "0.7.0-SNAPSHOT"]
                 [org.cloudhoist/iptables "0.7.0-beta.1"]
                 [org.cloudhoist/ssh "0.7.0-beta.1"]
                 [org.cloudhoist/ssh-key "0.6.0"]
                 [org.cloudhoist/node-js "0.7.0-SNAPSHOT"]
                 [lein-crate/lein-crate "0.1.0"]
                 ;;[prxml/prxml "1.3.1"]
                 ;;[org.clojure/clojure-contrib "1.3-compat"]
                 ]
  :dev-dependencies [[org.cloudhoist/pallet
                      "0.7.2" :type "test-jar"]
                     [org.cloudhoist/pallet-lein "0.5.2"]]
  :profiles {:dev {:plugins [[org.cloudhoist/pallet-lein "0.5.2"]]}}
  :java-source-paths ["src/java/"]
  :local-repo-classpath true
  :repositories
  {"sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"
   "sonatype" "https://oss.sonatype.org/content/repositories/releases/"})
