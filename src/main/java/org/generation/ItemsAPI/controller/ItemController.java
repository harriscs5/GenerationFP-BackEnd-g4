package org.generation.ItemsAPI.controller;

import org.generation.ItemsAPI.controller.dto.ItemDto;
import org.generation.ItemsAPI.repository.entity.Item;
import org.generation.ItemsAPI.service.ItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product_catalog")
public class ItemController {

    final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @CrossOrigin
    @GetMapping("/all")
    public Iterable<Item> getItems() {
        return itemService.all();
    }

    @CrossOrigin
    @PostMapping
    public Item save(@RequestBody ItemDto itemDto) {
        return itemService.save(new Item(itemDto));
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Item findItemById(@PathVariable Integer id) {
        return itemService.findById(id);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public Item update(@RequestBody ItemDto itemDto, @PathVariable Integer id) {
        Item item = itemService.findById(id);
        item.setName(itemDto.getName());
        item.setDescription(itemDto.getDescription());
        item.setImageUrl(itemDto.getImageUrl());
        return itemService.save(item);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        itemService.delete(id);
    }

}





