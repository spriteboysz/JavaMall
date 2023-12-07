/*
 * Author: Deean
 * Date: 2023-12-06 22:44
 * FilePath: js
 * Description: 
 */

Vue.component("header-bar",{
        data(){
            return{}
        },
        template:`
            <div class="divStyle">
                <table class="tableStyle">
                    <tr>
                        <td width="200" align="right" valign="middle">
                            测试
                        </td>
                        <td>
                            <label class="titleStyle">
                               测试2 
                            </label>
                        </td>
                        <td>
                            <slot></slot>
                        </td>
                        <td>
                            <button @click="childMethod">子组件中的按钮</button>
                        </td>
                    </tr>
                </table>
            </div>
        `
    }
)