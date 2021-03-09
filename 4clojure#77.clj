(fn foo [coll]
     (let [groups (group-by :list ( map 
        (fn [a] 
           (conj (hash-map :list (sort (clojure.string/split a #"")))
                    (hash-map :result a))
            )
        coll))]
        (loop [groups groups
                result #{}]
            (if (empty? groups) (set (remove #(= 1 (count %)) result))
                (recur (rest groups) 
                    (conj result
                        (set (keys(group-by :result 
                                    (-> groups first second)))))))))) 
                        
                        
                        
            
