package kara.demo.views

import kara.*
import kara.demo.models.Book
import kara.demo.styles.StyleClasses.*
import kara.demo.routes.Home
import kotlin.html.*

fun Forms(book: Book) = HtmlTemplateView<DefaultTemplate>(DefaultTemplate()) {
    content {
        h2 { +"Forms" }
        formForBean(book, Home.Update(), FormMethod.post) {

            table(fields) {
                tr {
                    td(cLabel) {
                        labelFor("title")
                    }
                    td {
                        textFieldFor("title")
                    }
                }
                tr {
                    td(cLabel) {
                        labelFor("author")
                    }
                    td {
                        textFieldFor("author")
                    }
                }
                tr {
                    td(cLabel) {
                        labelFor("isPublished", "Is Published?")
                    }
                    td {
                        checkBoxFor("isPublished")
                    }
                }
                tr {
                    td(cLabel + top) {
                        labelFor("description")
                    }
                    td {
                        textAreaFor("description")
                    }
                }
                tr {
                    td(cLabel) {
                        labelFor("category")
                    }
                    td {
                        radioFor("category", "fiction")
                        radioFor("category", "nonfiction")
                    }
                }
                tr {
                    td(cLabel) {
                    }
                    td {
                        submitButton("Submit")
                    }
                }
            }
        }
    }
}

