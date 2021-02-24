
(ns kata.core)

(declare toLower)
(defn toUpper [s]
  (if (empty? s) ""
    (str
        (clojure.string/upper-case (first s))
        (toLower (clojure.string/join (rest s)))
    )
))
(defn toLower [s]
  (if (empty? s)
    ""
    (str
        (clojure.string/lower-case (first s))
        (toUpper (clojure.string/join (rest s)))
        )
        )
    )

(defn solve [s]
    (vector
        (toUpper s)
     (toLower s)
    )
)
