(ns mercosul.core
    (:require [reagent.core :as r]
              [mercosul.components.input :refer [input]]))

(defn app []
  [:div {:className "flex flex-column blue center b pa3"} [:span "Placas Mercosul"] [:div {:className "pt2"}[input]]])
   
  
   

(defn stop []
  (js/console.log "Stopping..."))

(defn start []
  (js/console.log "Starting...")
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init []
  (start))
