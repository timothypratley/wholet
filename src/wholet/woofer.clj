(ns wholet.woofer)

(defprotocol Woofer
  (woof [this] "Woof!"))


;; below could be put in a factory

(defrecord Dog []
  Woofer
  (woof [this] "BARK!"))
(defrecord Cat []
  Woofer
  (woof [this] "Meeeow."))
(defrecord Bird []
  Woofer
  (woof [this] "Tweet, tweet."))

(def woofers [(Dog.) (Cat.) (Bird.)])
(defn get-woofer []
  (rand-nth woofers))
