;;;;
;;;;   Copyright (c) Ludger Solbach. All rights reserved.
;;;;
;;;;   The use and distribution terms for this software are covered by the
;;;;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;;;;   which can be found in the file license.txt at the root of this distribution.
;;;;   By using this software in any fashion, you are agreeing to be bound by
;;;;   the terms of this license.
;;;;
;;;;   You must not remove this notice, or any other, from this software.
;;;;

(ns org.soulspace.clj.java.swing.events-test
  (:require [clojure.test :refer :all]
            [org.soulspace.clj.java.swing.events :as sevt]))

; compilation test, ensures compilation of the required namespace
(deftest compile-test
  (testing "Compile test"
    (is (= 1 1)))) 