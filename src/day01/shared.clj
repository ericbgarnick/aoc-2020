(ns day01.shared
  (:require [clojure.string :refer [split]])
  (:require [clojure.set :refer [intersection]]))


(defn parse-input
  [token-sep]
  (map #(Integer/parseInt %) (split (slurp "src/day01/input.txt") (re-pattern token-sep))))

(defn find-pair
  [values goal]
  (let [needed (set (map #(- goal %) values))]
    (intersection (set values) needed)))
