let rec length l =
  match l with
    [] -> 0
  | h::t -> 1 + length t

let rec append a b =
  match a with
    [] -> b
  | h::t -> h :: append t b

let rec take n l =
  if n = 0 then [] else
    match l with
      h::t -> h :: take (n - 1) t

let rec drop n l =
  if n = 0 then l else
    match l with
      h::t -> drop (n - 1) t

let rec map f l =
  match l with
    [] -> []
  | h::t -> f h :: map f t

let rec member n l =
  match l with
    [] -> false
  | h::t -> n = h || member n t


