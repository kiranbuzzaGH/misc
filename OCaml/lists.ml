let rec length l =
  match l with
    [] -> 0
  | h::t -> 1 + length t

let rec append a b =
  match a with
    [] -> b
  | h::t -> h :: append t b

let rec take n l =
  match l with
    [] ->
      if n = 0
        then []
        else raise (Invalid_argument "take")
  | h::t ->
      if n < 0 then raise (Invalid_argument "take") else
        if n = 0 then [] else h :: take (n - 1) t

let rec drop n l =
  match l with
    [] ->
      if n = 0
        then []
        else raise (Invalid_argument "drop")
  | h::t ->
      if n < 0 then raise (Invalid_argument "drop") else
        if n = 0 then l else drop (n - 1) t

let rec map f l =
  match l with
    [] -> []
  | h::t -> f h :: map f t

let rec member n l =
  match l with
    [] -> false
  | h::t -> n = h || member n t

let rec merge cmp a b =
  match a, b with
    l, [] -> l
  | [], l -> l
  | ha::ta, hb::tb ->
      if cmp ha hb
        then ha :: merge cmp ta b
        else hb :: merge cmp a tb

let rec msort cmp l =
  match l with
    [] -> []
  | [x] -> [x]
  | h::t ->
      let len = length l / 2 in
        let left = take len l in
          let right = drop len l in
            merge cmp (msort cmp left) (msort cmp right)

let rec sum l =
  match l with
    [] -> 0
  | h::t -> h + sum t
