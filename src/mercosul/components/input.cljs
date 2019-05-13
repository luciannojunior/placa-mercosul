(ns mercosul.components.input
  (:require [reagent.core :as r]))

(def placa(r/atom ""))

(defn input [] [:input {:type "text" :value @placa
                        :on-change #(reset! placa (-> % .-target .-value))}])
