(ns com.example.pallet
    "Node defintions for drc-pallet"
    (:use
     [pallet.core :only [group-spec node-spec]]
     [pallet.configure :only [compute-service]]))

(def jenkins-slave-image-spec
  {:image-id "us-east-1/ami-ae17b2c6", ;; 12.04 LTS/amd64/hvm:ebs
   :hardware-id "c3.xlarge"})

(def jenkins-slave-node-spec
  (node-spec
   :image jenkins-slave-image-spec
   :network {:inbound-ports [22 80 8080 9090]}))

(defn
  ^{:doc "Defines a group spec that can be passed to converge or lift."}
  jenkins-slave-tmp [n]
  (group-spec
   "jenkins-slaves-tmp"
   :node-spec jenkins-slave-node-spec
   :count n))

(defn converge [count]
  (pallet.core/converge (jenkins-slave-tmp count) :compute (compute-service :aws)))
