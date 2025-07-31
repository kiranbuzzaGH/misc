type 'a tree =
  Br of 'a * 'a tree * 'a tree
| Lf

let rec insert tr k v =
  match tr with
    Lf -> Br ((k, v), Lf, Lf)
  | Br ((k', v'), l, r) ->
      if k = k' then Br ((k, v), l, r)
      else if k < k' then Br ((k', v'), insert l k v, r)
      else Br ((k', v'), l, insert r k v)
