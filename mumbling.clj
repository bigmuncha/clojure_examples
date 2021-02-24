

(ns accumule.core)

(defn funct
        [s numb]
        (if (empty? s) ""
           (str (clojure.string/upper-case (first s))
               (clojure.string/join (repeat numb (first s))) "-"
               (funct (clojure.string/join (rest s)) (+ numb 1)))))
    (defn accum
        [s]
        (clojure.string/join (drop-last
                              (funct
                               (clojure.string/lower-case s) 0)))
 )
