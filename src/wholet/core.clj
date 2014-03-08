(ns wholet.core
  (:require [wholet.woofer :refer [woof get-woofer]]))

(defn agitate [my-woofer]
  (woof my-woofer))

(repeatedly 20 #(agitate (get-woofer)))
