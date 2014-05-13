(ns me.rossputin.pew
	(:require [me.raynes.laser :as l]))

;; =============================================================================
;; Twitter Bootstrap class shortcuts
;; =============================================================================

(defonce glyph-info "glyphicon glyphicon-info-sign")
(defonce pnl-info "panel panel-info")


;; =============================================================================
;; Transformations over elements
;; =============================================================================

(defn clazz [classes payload] (assoc-in payload [:attrs :class] classes))
(defn title [title payload] (assoc-in payload [:attrs :title] title))
(defn width [width payload] (assoc-in payload [:attrs :width] width))


;; =============================================================================
;; Simple elements
;; =============================================================================

(defn a [h c] (l/node :a :attrs {:href h} :content c))
(defn ul [d] (l/node :ul :content d))
(defn ul-unstyled [d] (->> (ul d) (clazz "list-unstyled")))
(defn li [d] (l/node :li :content d))
(defn tr [d] (l/node :tr :content d))
(defn td [d] (l/node :td :content d))
(defn div ([] (l/node :div)) ([d] (l/node :div :content d)))
(defn span ([] (l/node :span)) ([d] (l/node :span :content d)))
(defn small [d] (l/node :small :content d))
(defn strong [d] (l/node :strong :content d))


;; =============================================================================
;; Content transformation shortcut
;; =============================================================================

(defn <- [d] (l/content d))
