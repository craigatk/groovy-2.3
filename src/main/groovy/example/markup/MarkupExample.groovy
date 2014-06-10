package example.markup

import groovy.text.Template
import groovy.text.markup.MarkupTemplateEngine
import groovy.text.markup.TemplateConfiguration

/**
 * See docs at http://groovy-lang.org/docs/groovy-2.3.2/html/documentation/markup-template-engine.html
 */
class MarkupExample {
    String markupFromTemplateFile() {
        Map model = [pageTitle: "Markup Page", pageHeading: "My First Markup Page"]

        TemplateConfiguration config = new TemplateConfiguration(
                autoIndent: true,
                autoIndentString: '  ',
                autoNewLine: true,
                newLineString: '\n'
        )
        MarkupTemplateEngine engine = new MarkupTemplateEngine(config)
        Template template = engine.createTemplateByPath("markup.tpl")
        Writable output = template.make(model)
        StringWriter writer = new StringWriter()
        output.writeTo(writer)

        return writer.toString()
    }
}
