package patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class NativeLibrary implements Library {

    private static final Map<String, Book> storage = new HashMap<>();

    static {
        storage.put( "1",
                Book.builder()
                        .uuid("1")
                        .name("The Canterbury Tales")
                        .author("Geoffrey Chaucer")
                        .text("Whan that Aprille with his shoures soote,\n" +
                                "The droghte of March hath perced to the roote,\n" +
                                "And bathed every veyne in swich licóur\n" +
                                "Of which vertú engendred is the flour;\n" +
                                "Whan Zephirus eek with his swete breeth\n" +
                                "Inspired hath in every holt and heeth\n" +
                                "The tendre croppes, and the yonge sonne...")
                        .year(1483)
                        .build()
        );
        storage.put( "2",
                Book.builder()
                        .uuid("2")
                        .name("Gulliver's Travels")
                        .author("Jonathan Swift")
                        .text("The author of these Travels, Mr. Lemuel Gulliver, is my ancient and\n" +
                                "intimate friend; there is likewise some relation between us on the\n" +
                                "mother's side. About three years ago, Mr. Gulliver growing weary\n" +
                                "of the concourse of curious people coming to him at his house in\n" +
                                "Redriff, made a small purchase of land, with a convenient house,\n" +
                                "near Newark, in Nottinghamshire, his native country; where he now\n" +
                                "lives retired, yet in good esteem among his neighbours...")
                        .year(1483)
                        .build()
        );
    }

    @Override
    public Book getProductByUid(String uid) {
        return storage.get(uid);
    }
}
