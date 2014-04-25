(ns me.rossputin.pew
	(:require [me.raynes.laser :as l]))

;; =============================================================================
;; Twitter Bootstrap classes
;; =============================================================================

(defonce glyph-info "glyphicon glyphicon-info-sign")
(defonce pnl-info "panel panel-info")


;; =============================================================================
;; Simple elements
;; =============================================================================

(defn a [h c] (l/node :a :attrs {:href h} :content c))
(defn ul-unstyled [d] (l/node :ul :attrs {:class "list-unstyled"} :content d))
(defn li [d] (l/node :li :content d))
(defn tr [d] (l/node :tr :content d))
(defn td [d] (l/node :td :content d))
(defn div ([] (l/node :div)) ([d] (l/node :div :content d)))
(defn span ([] (l/node :span)) ([d] (l/node :span :content d)))
(defn small [d] (l/node :small :content d))


;; =============================================================================
;; Transformations over elements
;; =============================================================================

(defn clazz [classes payload] (assoc-in payload [:attrs :class] classes))
(defn title [title payload] (assoc-in payload [:attrs :title] title))
(defn width [width payload] (assoc-in payload [:attrs :width] width))


;; =============================================================================
;; Content transformation shortcut
;; =============================================================================

(defn <- [d] (l/content d))
