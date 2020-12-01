(ns day01.solution1
  (:require [day01.shared :refer [parse-input find-pair]])
  (:gen-class))

(defn solution
  [values goal]
  (reduce * (find-pair values goal)))

(defn -main
  [& args]
  (println "PART 1: " (solution (parse-input "\n") 2020)))
