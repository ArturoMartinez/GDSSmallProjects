using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public static class Prompt
    {
        public static string Text { get; set; }

        private static DialogResult __result;

        public static DialogResult ShowDialog(string text, string caption)
        {
            Form prompt = new Form();
            prompt.Width = 500;
            prompt.Height = 150;
            prompt.Text = caption;
            Label textLabel = new Label() { Left = 50, Top = 20, Text = text, Width = 400};
            TextBox textBox = new TextBox() { Left = 50, Top = 50, Width = 400 };
            Button confirmation = new Button() { Text = "Ok", Left = 350, Width = 100, Top = 70 };
            Button cancel = new Button() { Text = "Cancel", Left = 200, Width = 100, Top = 70 };
            prompt.AcceptButton = confirmation;
            prompt.CancelButton = cancel;
            confirmation.Click += (sender, e) => { __result = DialogResult.OK; prompt.Close(); };
            cancel.Click += (sender, e) => { __result = DialogResult.Cancel; prompt.Close(); };
            prompt.Controls.Add(confirmation);
            prompt.Controls.Add(cancel);
            prompt.Controls.Add(textLabel);
            prompt.Controls.Add(textBox);            
            prompt.ShowDialog();
            textBox.TabIndex = 0;
            textBox.Focus();
            textBox.Select();
            Text = textBox.Text;
            return __result;
        }
    }
}
