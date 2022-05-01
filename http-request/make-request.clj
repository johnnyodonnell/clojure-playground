(require '[clj-http.client :as client])


(def main
  (fn []
    (println
      (client/get
        "https://johnnys-memos.github.io"))))

(main)

