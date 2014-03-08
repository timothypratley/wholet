(ns wholet.core
  (:require [wholet.woofer :refer [woof get-woofer]]))

(repeatedly 20 (comp woof get-woofer))
