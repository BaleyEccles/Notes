;; -*- lexical-binding: t; -*-

(TeX-add-style-hook
 "20240826120804-eng204_signals_and_linear_systems_assignment_1_2"
 (lambda ()
   (TeX-add-to-alist 'LaTeX-provided-class-options
                     '(("article" "11pt")))
   (TeX-add-to-alist 'LaTeX-provided-package-options
                     '(("inputenc" "utf8") ("fontenc" "T1") ("graphicx" "") ("longtable" "") ("wrapfig" "") ("rotating" "") ("ulem" "normalem") ("amsmath" "") ("amssymb" "") ("capt-of" "") ("hyperref" "") ("minted" "") ("geometry" "a4paper" "margin=2.5cm") ("fontspec" "") ("biblatex" "backend=biber" "style=apa")))
   (add-to-list 'LaTeX-verbatim-environments-local "minted")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "href")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "hyperimage")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "hyperbaseurl")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "nolinkurl")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "url")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "path")
   (add-to-list 'LaTeX-verbatim-macros-with-delims-local "path")
   (TeX-run-style-hooks
    "latex2e"
    "article"
    "art11"
    "inputenc"
    "fontenc"
    "graphicx"
    "longtable"
    "wrapfig"
    "rotating"
    "ulem"
    "amsmath"
    "amssymb"
    "capt-of"
    "hyperref"
    "minted"
    "geometry"
    "fontspec"
    "biblatex")
   (LaTeX-add-labels
    "sec:org831f92d"
    "sec:org72d9136"
    "fig:FBD"
    "sec:orgb61511b"
    "sec:orgfba282b"
    "sec:org752e860"
    "sec:orgd8c82cd"
    "sec:org99c1e04"
    "sec:org87702d8"
    "sec:org398812d"
    "sec:orge1b9b37"
    "fig:impulse_response_111"
    "fig:impulse_response_22"
    "sec:org6a1b386"
    "sec:org77cbc0f"
    "sec:orgdd4ad96"
    "sec:orgfb1537d"
    "fig:5hz"
    "fig:0.3hz"
    "fig:1000hz"
    "sec:org70c3b0a"
    "sec:org5621049"
    "sec:org5ab6351"
    "sec:org2a10006")
   (LaTeX-add-bibliographies
    "citation"))
 :latex)
