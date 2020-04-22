# Sample-Merge-Adapter

Merge Adapter helps us to merge the multiple RecyclerView adapters sequentially. 

```
jutsuAdapter = JutsuAdapter(...)
characterAdapter = CharacterAdapter(...)
mergeAdapter = MergeAdapter(characterAdapter, jutsuAdapter)
rvNaruto.adapter = mergeAdapter
```    
