(ns Counter
  (:require
   ["solid-js" :refer [createSignal]]
   [squint.string :as str]))

(defn Counter [{:keys [init]}]
  (let [[counter setCount] (createSignal init)]
    #jsx [:div
          "Count:" (str/join " " (range (counter)))
          [:ul (vec (interpose " " ["Hello" "world"]))]
          [:div
           [:button
            {:onClick (fn []
                        (setCount (inc (counter))))}
            "Click me"]]]))


