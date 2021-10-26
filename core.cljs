(require '["aws-sdk$default" :as aws])
(def sts (aws/STS.))

(defn handler [event context]
  (js/Promise. (fn [resolve reject]
                 (.getCallerIdentity sts nil (fn [err data]
                                               (resolve data))))))

handler
