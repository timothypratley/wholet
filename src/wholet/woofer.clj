(ns wholet.woofer)

(defprotocol Woofer
  (woof [this]))

(defrecord Dog []
  Woofer
  (woof [this] "BARK!"))

(defn new-woofer []
  (Dog.))
