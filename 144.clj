(defn foo [init & funcs]
    (fn doo [init prev functions funcs]
            (if (empty? funcs) 
            (lazy-seq (cons init  (doo init init functions functions)))
                    (lazy-seq (cons ((first funcs) prev) 
                            (doo init ((first funcs) prev) functions 
                                    (rest funcs)))))
    )
    init init funcs funcs)
