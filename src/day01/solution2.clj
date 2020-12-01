(ns day01.solution2
  (:require [clojure.set :refer [union]])
  (:require [day01.shared :refer [parse-input find-pair]])
  (:gen-class))

(defn find-triple
  [values complements]
  (apply union (filter #(= (count %) 2) (map #(find-pair values %) complements))))

(defn solution
  [values goal]
  (let [complements (map #(- goal %) values)]
    (reduce * (find-triple values complements))))

(defn -main
  [& args]
  (println "PART 2: " (solution (parse-input "\n") 2020)))
