package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    List<Book> books = new ArrayList<>();

    @PostMapping("/book_create")
    public String _(@ModelAttribute Book book)
    {
        books.add(book);
        return "all_books";
    }

    @GetMapping("/all_books")
    public String _(Model model)
    {
        model.addAttribute("books", books);
        return "all_books";
    }


}

