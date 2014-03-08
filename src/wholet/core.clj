(ns wholet.core
  (:require [wholet.woofer :refer [woof new-woofer]]))

(defn agitate [my-woofer]
  (woof my-woofer))

(agitate (new-woofer))
