
(def fact
  (fn [n]
    (cond
          (<= n 0) 1
          :else (* n (fact (dec n))))))

(def main
  (fn
    ([] (main 0))
    ([i]
     (cond
       (> i 15) (println "Done.")
       :else (do
               (println (fact i))
               (main (inc i)))))))

(main)

