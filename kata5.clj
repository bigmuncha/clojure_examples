
(ns egypt.core
              (:use [clojure.string :as s ]))

(defn float_
              [string]
              (let
                  [numbers (s/split string #"/")
                   numer (Integer/parseInt (first numbers))
                   denom (Integer/parseInt (first (rest numbers)))
                   ]
                nil
                )
                )
(defn parse-int
              [string]
              (let
                  [numbers (s/split string #"/")
                   numer (Integer/parseInt (first numbers))
                   denom (Integer/parseInt (first (rest numbers)))
                   ]
                (vector numer denom)
                ))

(defn integer_
              [string]
              (if (= (Integer/parseInt string) 0)
                []
                (vector string)))

(defn decompose
              [string]
              (if (support string "/")
                (integer_ string)
                (float_ string)))

(defn support
              [string]
              (if (s/includes? string "/")
                true
                false))
