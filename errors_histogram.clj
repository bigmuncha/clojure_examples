
(ns hist-error.core
  (:use [clojure.string :only [join includes?]]))

(defn supporter
                 [s ch]
                 (let [numb (count (re-seq (re-pattern ch) s))]
                 (if (includes? s ch)
                   (str ch "  " numb "     " ( join (repeat numb "*")) "\r")
                   "" )))
(defn hist
                 [s]
                 (let [a (supporter s "u")
                       b (supporter s "w")
                       c (supporter s "x")
                       d (supporter s "z")]
                 (join (drop-last (str a b c d)))))
