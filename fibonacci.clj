
(def fib
  (fn [n]
    (cond (< n 2) 1
          :else
          (do (+ (fib (dec n))
                 (fib (- n 2)))))))

(def main
  (fn
    ([] (main 0))
    ([i]
     (cond (> i 20) (println "Done.")
           :else (do (println (fib i))
                     (main (inc i)))))))
(main)

