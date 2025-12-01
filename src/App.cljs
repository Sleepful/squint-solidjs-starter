(ns App
  (:require ["./App.module.css$default" :as styles]
            ["./logo.svg$default" :as logo]
            ["./Counter" :refer [Counter]]))

(defn App []
  #jsx [:div {:class styles.App}
        [:header {:class styles.header}
         [:img {:src logo
                :class styles.logo
                :alt "logo"}]
         [Counter {:init 5}]]])

(def default App)
