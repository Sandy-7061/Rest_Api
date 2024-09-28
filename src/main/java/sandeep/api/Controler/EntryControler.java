package sandeep.api.Controler;

import org.springframework.web.bind.annotation.*;
import sandeep.api.entity.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/entity")
public class EntryControler {

    private Map<Long, Entity> entityMap = new HashMap<>();

    @GetMapping
    public List<Entity> getall(){
        return new ArrayList<>(entityMap.values());
    }

    @PostMapping
    public boolean createentity(@RequestBody Entity entity){
        entityMap.put(entity.getId(),entity);
        return true;
    }

    @GetMapping("id/{myid}")
    public Entity getbyid(@PathVariable Long myid){
        return entityMap.get(myid);
    }

    @DeleteMapping("id/{myid}")
    public Entity deleteid(@PathVariable Long myid){
        return entityMap.remove(myid);
    }

    @PutMapping("id/{id}")
    public Entity updateentity(@PathVariable Long id, @RequestBody Entity entity){
        return entityMap.put(id,entity);
    }
}
