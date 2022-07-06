/*
 * MIT License
 *
 * Copyright (c) 2022 kerelape
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
// @checkstyle PackageNameCheck (1 line)
package EOorg.EOeolang.EOjvm_bridge;

import org.eolang.AtComposite;
import org.eolang.AtFree;
import org.eolang.AtVararg;
import org.eolang.PhDefault;
import org.eolang.Phi;

/**
 * Native object.
 *
 * @since 0.0.0
 * @todo #2:15min Native object must include `is-null` attribute.
 *  This attribute must returns `TRUE` if the underlying native
 *  object is not `null`, and `FALSE` otherwise.
 * @todo #2:30min Native object must provide a way to call its methods.
 *  For example, these can to be accessible as `native-object`'s
 *  attributes (translated to kebab case) or via a supporting object.
 * @checkstyle TypeNameCheck (10 lines)
 */
public final class EOnative_object extends PhDefault {
    /**
     * Ctor.
     *
     * @param sigma Parent.
     */
    public EOnative_object(final Phi sigma) {
        super(sigma);
        this.add("name", new AtFree());
        this.add("args", new AtVararg());
        this.add(
            "φ",
            new AtComposite(
                this,
                rho -> rho.attr("name").get()
            )
        );
    }
}
