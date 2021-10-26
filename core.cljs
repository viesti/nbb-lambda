(defn handler [event context]
  (println event)
  (js/Promise. (fn [resolve reject]
                 (resolve (clj->js {"hello" "world"})))))

handler
