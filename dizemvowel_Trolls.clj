
(ns disemvowel-trolls)

(defn disemvowel
  [string]
  (apply str (remove (set "aeiouAEIOU")
                     string))
)
