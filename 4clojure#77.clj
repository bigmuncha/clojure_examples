(ns clojure.examples.hello
	(:gen-class))

(defn foo [coll]
     (let [groups (group-by :list ( map 
        (fn [a] 
           (conj (hash-map :list (sort (clojure.string/split a #"")))
                    (hash-map :result a))
            )
        coll))]
        groups))

            
(println (foo ["veer" "lake" "item" "kale" "mite" "ever"]))
