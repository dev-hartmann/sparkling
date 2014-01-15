(ns flambo.utils
  (:import (scala Tuple2)))

(defn echo-types [c]
  (if (coll? c)
    (println "TYPES" (clojure.core/map type c))
    (println "TYPES" (type c)))
  c)

(defn trace [msg]
  (fn [x]
    (prn "TRACE" msg x)
    x))

(defn truthy? [x]
  (if x (Boolean. true) (Boolean. false)))

(defn as-integer [s]
  (Integer. s))

(defn as-long [s]
  (Long. s))

(defn as-double [s]
  (Double. s))

(def ^:private flambo
  ["101111111011101                        11111      1  1                         1"
   "111111111110                          11111       1 11                       111"
   "0111111001                           111111      11111                     11111"
   "0111111                             1111111      11111                   1111111"
   "01111                               1111111     1111111                111111111"
   "101                               111111111   111111111              11111111111"
   "                                 1111111111   111111111         1   11111111111"
   "                                11111111111  1111111111         1 1111111111111"
   "                               111111111111 111111111111        111111111111111"
   "                              11111111111111111111111111       111 111111111111"
   "                             11111111111  1111   1111111       111 111111111111"
   "                            11111111111  1111    1111111    1  1111111111111111"
   "                           1111111111    11       111111  111  1111111111111111"
   "                           111     11             111111 1111  1111111111111111"
   "                          1111  00011              11111 1111  11 1111111111111"
   "                          1111 00 01            1  11111 11111 11 1111111111111"
   "                          1111000 01         0000   1111 11111 1111111111111111"
   "                          111111111         00  0   1111 1111111 11111111111111"
   "                          111111111        0011     1111 1111 11 11111111111111"
   "                          111111111                 1111 1111 11 11111111111111"
   "      11111                11111111      11        1111111111 11 11111111111111"
   " 11111111111111            11111111  0001         11111 11111111  11111111111111"
   "111111111111111111          11111111              11111111111111  11111111111111"
   "1111111111111111111111111111 11111111           111111 1111111111111111111111111"
   "11111111111111111111111111111 111111111       1111111 111111 111 111111111111111"
   "11111111111111111111111111  111 1111111111 111111111 1111111111 1111111111111111"
   "111111111111111111111111111 11111 1111111   11111  11111111 11111111111111111111"
   "1111111111111111111111111111 1111 111111  1111  11111111111111 11111111111111111"
   "11111111111111111111111111 111  1 111111 1 111 11111111111111 111111111111111111"
   "1111111111111111111111111111 111111111111 11 1  11111111111111111111111111111111"
   "111111111111111111111111111111  1111111111 1111 1111111111 1 1111111111111111111"
   "111111111111111111111111111111111 1111111111 111 1111111111111111111111111111111"
   "11111111111111111111111111111111111111111111111111111111111111111111111111111111"
   "1111111111111111111111111111111111111111111111111 111111111 11111111111111111111"
   "1111111111111111111111111111111111 1111111111111111111111 1 11111111111111111111"
   "1111111111111111111111111111111111 111111111111111 11111111 11111111111111111111"
   "11111111111111111111111111111111111111111111111111 11111111 11111111111111111111"
   "11111111111111111111111111111111111 1111111111111111111111 111111111111111111111"
   "1111111111111111111111111111111111111111111111111111111111 1 1111111111111111111"
   "111111111111111111111111111111111111 11111111111111 111111111111111111111111111"])

(defn hail-flambo []
  (doseq [hs flambo]
    (prn hs)))
